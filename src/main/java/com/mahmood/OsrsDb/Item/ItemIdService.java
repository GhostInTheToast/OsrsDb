package com.mahmood.OsrsDb.Item;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemIdService
{

    public List<ItemIdPOJO> getItemId() {
        return List.of(new ItemIdPOJO(1,"fire rune"));
    }

}
