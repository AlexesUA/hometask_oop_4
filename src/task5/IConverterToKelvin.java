package task5;


interface IConverterToKelvin {
    default double converter(double celsius){
        return celsius + 271.15;
    }
}
