package hu.shop.shoppinglist.controller;

import hu.shop.shoppinglist.model.Shopping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/shopping")
public class ShoppingController {

        List<Shopping> shoppingList = new ArrayList<>();

        @PostMapping("/add")
        @ResponseStatus(HttpStatus.CREATED)
        public List<Shopping>  addShoppingList(@RequestBody Shopping[] array){

            shoppingList = Arrays.stream(array).toList();

            shoppingList.forEach(System.out::println);
            return shoppingList;
        }

        @GetMapping("/list")
        public List<Shopping> shoppingListing(){

            return shoppingList;
        }

        @DeleteMapping("/delete/{index}")
        public List<Shopping> deleteItemByIndex(@PathVariable int index){
            shoppingList.remove(index);
            shoppingList.forEach(System.out::println);
            return shoppingList;
        }
    }

