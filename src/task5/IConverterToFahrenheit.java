package task5;

interface IConverterToFahrenheit {

    default double converter(double celsius){
        return (celsius * ((double) 9 /5)) + 32;
    }
}
