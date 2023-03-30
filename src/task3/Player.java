package task3;

public class Player implements IPlayable, IRecordable{

    private int trackNumber;

    private char stateKey;


    public Player(){
        trackNumber = 0;
        stateKey = 's';
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    private void setTrackNumber(int trackNumber) {
        if(trackNumber < 0) this.trackNumber = 0;
        else this.trackNumber = trackNumber;
    }

    //Я розумію, що надлишковий метод, але, як на мене, така реалізація біль простіше читається
    // та її простіше модифікувати, якщо то буде необхідно.
    public void goToTrack(int trackNumber){
        setTrackNumber(trackNumber);
    }

    public char getStateKey() {
        return stateKey;
    }

    public void getState() {
        switch (stateKey){
            case 'l' -> play();
            case 'p' -> pause();
            case 'r' -> stop();
            case 's' -> record();
        }
    }

    public boolean setState(char stateKey) {
        switch (stateKey){
            case 'l', 'p', 'r', 's', 'g' -> {
                this.stateKey = stateKey; //'l' - play, 'p' - pause, 'r' - rec, 's' - stop, 'g' - go to track
                if(this.stateKey == 'l') trackNumber++;
                return true;
            }

        }
        System.out.println("Помилка управління.");
        return false;
    }

    @Override
    public void play() {
        System.out.println("Програвання " + trackNumber + " треку. ");
    }

    @Override
    public void pause() {
        System.out.println("Пауза. ");
    }

    @Override
    public void stop() {
        System.out.println("Стоп. ");
    }

    @Override
    public void record() {
        if(trackNumber == 0) System.out.println("Запис нового трека. ");
        else System.out.println("Перезапис треку № " + trackNumber);
    }

}
