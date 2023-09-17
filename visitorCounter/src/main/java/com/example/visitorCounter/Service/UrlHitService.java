package com.example.visitorCounter.Service;

import com.example.visitorCounter.entity.Visitor;
import com.example.visitorCounter.repo.VisitorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    @Autowired
    VisitorRepo count;

    @Autowired
    Visitor visitor;

   public Map<String, Visitor> addUserMap(){
       return count.getMap();
   }

    public Visitor visitorCount(String userName){
        Map<String,Visitor> map= addUserMap();
        if(map.containsKey(userName)){
            Visitor vis=map.get(userName);
            int count= vis.getHitCount();
            count++;
            vis.setHitCount(count);

        }else {
            visitor.setUserName(userName);
            visitor.setHitCount(1);
            map.put(userName, visitor);
        }
        return map.get(userName);
    }


}
