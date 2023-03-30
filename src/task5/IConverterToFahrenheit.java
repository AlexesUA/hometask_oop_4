package task5;

interface IConverterToFahrenheit {

    default double converter(double celsium){
        return (celsium * ((double) 9 /5)) + 32;
    }
}
