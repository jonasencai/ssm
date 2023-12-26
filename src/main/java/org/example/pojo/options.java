package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Getter
@Setter
@Component
@ToString
public class options {
    private ArrayList<Integer> optlist;
    private int questionnaireid;
    private int stuid;
}
