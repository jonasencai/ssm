package org.example.pojo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Getter
@Setter
@Component
@ToString
public class QuestionnaireFront {
    private int id;
    private ArrayList<Integer> qnList;
}
