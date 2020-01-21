package jp.ac.uryukyu.ie.e195705;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Action_3Test {

    @Test
    void action_3() {
    String input_1 = "アサカ";
    String input_2 = "カノウ";
    String word_end = input_1.substring(input_1.length() -1);//入力した文字列の末尾1文字を取得する
    String word_initial = input_2.substring(0,1);//入力した文字列の先頭1文字を取得する
    assertEquals(word_end,word_initial);
    }
}