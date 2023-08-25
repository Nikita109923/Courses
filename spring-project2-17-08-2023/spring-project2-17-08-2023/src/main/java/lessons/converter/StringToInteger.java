package lessons.converter;

import org.springframework.core.convert.converter.Converter;

public class StringToInteger implements Converter<String,Integer> {

    public Integer convert(String source){
        return Integer.valueOf(source) + 1000;
    }


}
