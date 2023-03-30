package task5;


interface IConverterToKelvin {
    default double converter(double celsium){
        return (celsium * ((double) 9 /5)) + 32;
    }
}
