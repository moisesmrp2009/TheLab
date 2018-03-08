//Student FDU: Moises Rivas     
package CP2;

public class StringExample {
    
    public static void main(String[] args) {
 
        //using stringReplace method to replace a substring from str with a new substring
        String original = "FDU is bad";
        String oldString = "bad";
        String newString = "good";
        
        String modified = stringReplace( oldString, newString, original );
        
        System.out.println("OLD: " + original);
        System.out.println("NEW: " + modified);
 
    }
    public static  String replace(char c, char rp, String s){
        char[] chr= s.toCharArray(); // converts a string into an array of characters
        for(int i=0; i<chr.length;i++)
            if(chr[i]==c)
                chr[i]=rp;
        String str= new String(chr); // converts a n array into a string
        return str;
    }
    public static String stringReplace( String oldString, String newString, String str ){
        char[] oldstring = oldString.toCharArray();
        char[] newstring = newString.toCharArray();
        char[] original = str.toCharArray();
        
        //...> FIRST CHECK <...//
        int times=0;
        for( int check=0; check <original.length; check++ ){ //finding times oldstring repeats
            if( original[check] == oldstring[0] ){
                char[] buffer = new char[oldstring.length];
                for( int i=0,j=check; i<oldstring.length; i++,j++){
                    buffer[i] = original[j];
                }
                if( oldString.equals(new String(buffer) )){
                    times++;
                }
            }
        }
        char[] modified = new char[original.length - times*oldstring.length + times*newstring.length];
        
        //...> SECOND CHECK <...//
        for( int check =0, add=0; check<original.length; check++,add++ ){
            
            if( original[check] == oldstring[0] ){
                char[] buffer = new char[oldstring.length];
                for( int i=0,j=check; i<oldstring.length; i++,j++ ){
                    buffer[i] = original[j];
                }
                if( oldString.equals(new String(buffer)) ){
                    for(int i=0; i<newstring.length; i++,add++){
                        modified[add] = newstring[i];
                    }
                    if( (check+oldstring.length)>original.length ){
                        break;
                    }
                    else{
                        add = add-1;
                        check = check+(oldstring.length-1);
                        continue;
                    }
                    
                }
            }
            modified[add] = original[check];
        }
        return new String( modified );
    }
}
