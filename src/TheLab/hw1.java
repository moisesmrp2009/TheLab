package TheLab;

//  Student: Moises Rivas       Student ID: 1809547
//  Write a program that generates 1000 random integers between 0 and 9 and displays the count of each numbers.

class Hw1 {

    public static void main(String[] args) {
        int counter=1;
        int random_number;
        
        System.out.println("counter\t:\trandom number");
        
        while( counter <= 1000){
            random_number = (int)(Math.random()*10);
            System.out.println( counter + "\t:\t" + random_number );
            counter++;
        }
    }
}
