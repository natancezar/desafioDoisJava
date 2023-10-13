// Class for iPhone
public class MyIPhone implements MusicPlayer, Phone, Browser {

    public static void main(String[] args) {}

    // Music Player
    @Override
    public void playSong() {}

    @Override
    public void pause() {}

    @Override
    public void nextSong() {}

    @Override
    public void beforeSong() {}

    // Phone
    @Override
    public void dialNumber(String number) {}

    @Override
    public void call() {}

    @Override
    public void answer() {}

    @Override
    public void sandVoceMessage() {}

    // Internet Browser
    @Override
    public void openPage(String url) {}

    @Override
    public void searchTerm(String url) {}

    @Override
    public void refreshPage() {}

     @Override
    public void closePage() {}
}

