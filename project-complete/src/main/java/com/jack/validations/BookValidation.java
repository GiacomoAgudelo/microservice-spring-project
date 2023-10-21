package com.jack.validations;

import com.jack.dto.BookRequestDto;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class BookValidation {

    public void validInputPost(final BookRequestDto bookRequestDto) throws Exception {
        if(Objects.nonNull(bookRequestDto)){
            this.validPrice(bookRequestDto.getPrice());
            this.validId(bookRequestDto.getId());
        }else{
            throw new Exception();
        }

    }

    private void validId(final Long id) throws Exception {
        if(Objects.nonNull(id)){
            String stringNumber = id.toString();
            String[] singleNumbers = stringNumber.split("");
            List<String> singleNumberArrayList = Arrays.asList(singleNumbers);
            this.isOnlyNumber(singleNumberArrayList);
            this.digitLength(singleNumberArrayList);
            this.isValidSum(singleNumberArrayList);

        }

    }

    private void isValidSum(final List<String> singleNumberArrayList) throws Exception {
        int max = 42;
        int total = 0;
        for(String number : singleNumberArrayList){
            total +=  Integer.parseInt(number);
        }
        if(!(total == max)){
            throw new Exception();
        }

    }

    private void digitLength(final List<String> singleNumberArrayList) throws Exception {
        int lenght = 6;
        if(!(lenght == singleNumberArrayList.size())){
            throw new Exception();
        }
    }

    private void isOnlyNumber(final List<String> singleNumberArrayList) throws Exception {
        for(String number : singleNumberArrayList){
            try{
                Long.parseLong(number);
            }catch (Exception e){
                throw new Exception();
            }

        }
    }

    private void validPrice(final Long price) throws Exception {
        if(!(0 < price && price < 1000)){
            throw new Exception();
        }
    }

}
