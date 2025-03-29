import java.util.Random;

class PixelBuffer {
    public static void main(String[] args) throws InterruptedException{
        char[][] pixels = {{' ',' ',' ',' '},{' ',' ',' ',' '},{' ',' ',' ',' '},{' ',' ',' ',' '}};
        Random rand = new Random();
        
        //game loop
        while (1==1){
            //erase screen
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            //entire buffer and rendering
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 4; j++){
                    //set pixel value
                    int rng = rand.nextInt(3);
                    if (rng == 0){
                        pixels[i][j] = '/';
                    }
                    else if (rng == 1){
                        pixels[i][j] = '*';
                    }
                    else if (rng == 2){
                        pixels[i][j] = '@';
                    }
                    //draw pixel
                    System.out.print(pixels[i][j]);
                }
                System.out.println();
            }
            Thread.sleep(100);    
        }
    }
}