package task3;

public class Player implements IPlayable, IRecordable{

    int trackNumber;


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
