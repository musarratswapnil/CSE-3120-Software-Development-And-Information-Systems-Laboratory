package Lab04;

public class Main {
    public static void main(String[] args) {


        //GeneralTV

        GeneralTV gtv=new GeneralTV();
        Remote remote= new Remote(gtv);
        System.out.println("General Tv::");
        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();
        remote.channelDown();
        remote.volumeDown();

        //SmartTV
        System.out.println();
        System.out.println("Smart Tv::");
        SmartTV stv=new SmartTV();
        SmartRemote sremote= new SmartRemote(stv);
        sremote.togglePower();
        sremote.volumeUp();
        sremote.channelUp();
        sremote.channelDown();
        sremote.volumeDown();

        System.out.println();
        //Youtube Class
        YoutubeClass yt=new proxyLoadYoutube();

        //Accessing Youtube() using smart-remote.
        sremote.showYoutube(yt);
        sremote.showYoutube(yt);
        //Direct accessing Youtube().
        //stv.Youtube(yt);
    }
}
