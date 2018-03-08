//Moises Rivas      Student ID: 1809547
package TheLab;

class Box {
    private int width, height, depth;
    private String color, type;
    
    Box(){
        color = "black";
        type = "regular";
        width = 1;
        height = 1;
        depth = 1;
    }
    Box( int width, int height, int depth ){
        this.width = width;
        this.height = height;
        this.depth = depth;
        color = "black";
        type = "regular";
    }
    

    public Box setBox( int width, int height, int depth, String color, String type ){
        this.color = color;
        this.type = type;
        return new Box( width, height, depth );
    }
    public int volume( Box box ){
        return box.depth * box.height * box.width;
    }
    public String getColor( Box box ){
        return box.color;
    }
    public String getType( Box box ){
        return box.type;
    }
    public int getWidth( Box box ){
        return box.width;
    }
    public int getHeight( Box box ){
        return box.height;
    }
    public int getDepth( Box box ){
        return box.height;
    }
}

class Lab2 {
    public static void main(String[] args) {
        Box[] arr = new Box[5];
        for( int i=0; i<arr.length; i++){
            arr[i] = new Box();
        }
        
        for( int i=0; i<arr.length; i++){
            printBoxInfo( arr[i] );
        }
    }
    
    public static void printBoxInfo( Box box ){
        System.out.println("Box color: " + box.getColor(box));
        System.out.println("Box type: " + box.getType(box) );
        System.out.println("Box width: " + box.getWidth(box) );
        System.out.println("Box height: " + box.getHeight(box) );
        System.out.println("Box depth: " + box.getDepth(box) );
        System.out.println("Box volume: " + box.volume(box) );
    }
}
