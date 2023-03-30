package task3;

public class Player implements IPlayable, IRecordable{

    private int trackNumber;

    private char state;


    public Player(){
        trackNumber = 0;
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

    public char getState() {
        return state;
    }

    public boolean setState(char state) {
        switch (state){
            case 'l', 'p', 'r', 's' -> {
                this.state = state; //'l' - play, 'p' - pause, 'r' - rec, 's' - stop
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
        else System.out.println("Перезаписуємо трек № " + trackNumber);
    }

}
