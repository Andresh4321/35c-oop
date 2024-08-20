package week9;

public class interfacetask {
    public static void main(String[] args) {
        
    }
    /*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 */ 

}
interface media{
    public void play();
    public void pause();
    public void next();
    public void previous();
    public String nowPlaying();
}
interface onlineasset{
    public void download();
}
interface DigitalMedia extends media{
    public double size();
    public int remaining(double current);

}
class spotify implements media,onlineasset{
    @Override
    public void play(){
        System.out.println("play");
    }
    @Override
    public void pause(){
        System.out.println("pause");
    }
    @Override
    public void next(){
        System.out.println("next");
    }
    @Override
    public void previous(){
        System.out.println("previous");
    }
    

}