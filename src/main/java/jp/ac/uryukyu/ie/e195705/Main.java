package jp.ac.uryukyu.ie.e195705;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Words {
    //効率よくしりとりを行いたいため全てをカタカナで表記する。わかりにくい場合は()を用いて表記する。
    List<String> words = new ArrayList<>();
    List<String> words_A = new ArrayList<>(Arrays.asList("アルキメデス", "インテグラル", "ウ（裏）ラ", "エラトステネスノフル（エラトステネスの篩）イ", "オイラーノコウシ（オイラーの公式）キ"));
    List<String> words_K = new ArrayList<>(Arrays.asList("カクリ（確率）ツ", "キョス（虚数）ウ", "クミアワ（組み合わせ）セ", "ケーニヒスベルグノハ（ケーニヒスベルグの橋）シ", "コセカント"));
    List<String> words_S = new ArrayList<>(Arrays.asList("サンカクス（三角数）ウ", "シゼンタイス（自然対数）ウ", "スーパーソス（スーパー素数）ウ", "セイタメンタ（正多面体）イ", "ソインスウブンカ（素因数分解）イ"));
    List<String> words_T = new ArrayList<>(Arrays.asList("タンジェント", "チャンパーノウンテイス（チャンパーノウン定数）ウ", "ツェラーノコウシ（ツェラーの公式）キ", "テイラーテンカ（テイラー展開）イ", "トクセイホウテイシ（特性方程式）キ"));
    List<String> words_N = new ArrayList<>(Arrays.asList("ナユ（那由多）タ", "ニコウケイス（二項係数）ウ", "", "ネイピアス（ネイピア数）ウ", "ノ（NOR）ア"));
    List<String> words_H = new ArrayList<>(Arrays.asList("ハミルトンサイクル", "ヒルベルトホテル", "フィボナッチスウレ（フィボナッチ数列）ツ", "ヘロンノコウシ（ヘロンの公式）キ", "ホシュウゴ（補集合）ウ"));
    List<String> words_M = new ArrayList<>(Arrays.asList("マンデルブロシュウゴ（マンデルブロ集合）ウ", "ミチス（未知数）ウ", "ムゲンダ（無限大）イ", "メルセンヌ", "モンテカルロホ（モンテカルロ法）ウ"));
    List<String> words_Y = new ArrayList<>(Arrays.asList("ヤコビギョウレ（ヤコビ行列）ツ","", "ユークリッドノゴジョホ（ユークリッドの互除法）ウ","", "ヨゲンテイ（余弦定理）リ"));
    List<String> words_R = new ArrayList<>(Arrays.asList("ライプニッツ", "リシンリ（離心率）ツ", "ルーローノサンカッケ（ルーローの三角形）イ", "レーダーチャート", "ロンリエンザン（論理演算子）シ"));

    List<String> char_words = new ArrayList<>();
    List<String> char_words_All = new ArrayList<>(Arrays.asList("ア","イ","ウ","エ","オ","カ","キ","ク","ケ","コ","サ","シ","ス","セ","ソ","タ","チ","ツ","テ","ト","ナ","ニ","ヌ","ネ","ノ","ハ","ヒ","フ","ヘ","ホ","マ","ミ","ム","メ","モ","ヤ","","ユ","","ヨ","ラ","リ","ル","レ","ロ"));

    void words(){
        //javaにはタプルが存在しないため、1行で要素を追加した。（そうでないと行数を稼いでるようになってしまうので、、）
        words.addAll(words_A);words.addAll(words_K);words.addAll(words_S);words.addAll(words_T);words.addAll(words_N);words.addAll(words_H);words.addAll(words_M);words.addAll(words_Y);words.addAll(words_R);
    }

    void char_words(){
        char_words.addAll((char_words_All));
    }
}

class Character{
    String name;
    static String word_end;//変数を継承したいからstatic
    static String word_initial;
    static String input;

    void Name(String name){
        this.name = name;
        System.out.println(name);
    }

    void Word_end(String word_end){
        this.word_end = word_end;
        System.out.println(word_end);
    }

    void Word_initial(String word_initial){
        this.word_initial = word_initial;
        System.out.println(word_initial);
    }
}

class Player extends Character{
    void Player_name(String name){
        Name(name);
    }
}

class Computer extends Character{
    void Computer_name(String name){
        Name(name);
    }
}

/**
 *しりとりのルールに従って、50音とその他を区別し、それぞれの処理を行っているクラス
 */
class Action_0 extends Character{
    int count = 0;

    public void Action_0(){
        Words word = new Words();
        word.words();
        Words char_word = new Words();
        char_word.char_words();
        while (count <= 0){
            word_end = input.substring(input.length() -1);//入力した文字列の末尾1文字を取得する
            if (word_end.matches("[ア-ン]")) {//正規表現は""で括る
                if (word_end.matches(("[ヌワヲ]"))) {
                    System.out.println("そのような数学的単語は私には見つけられぬ、、\n貴様の勝ちだ");
                    break;
                }if (word_end.matches(("[ン]"))) {
                    System.out.println("貴様はしりとりのルールも知らんのか！\nもう一回だ");
                    break;
                }if (word_end.matches("[ーャュョ　]")){
                    System.out.println("あ、それはなしで、、");
                    continue;
                }
                break;
            }else {
                System.out.println("申し訳ないがカタカナ表記で頼む、、");
            }
        }
    }
}

/**
 * コンピューターが返す文字列を処理するクラス
 */
class Action_1 extends Character{
    int count = 0;

    public void Action_1(){
        Words word = new Words();
        word.words();
        Words char_word = new Words();
        char_word.char_words();
        while (count <= 0){
            int num = char_word.char_words.indexOf(word_end);
            System.out.println("→"+word.words.get(num));
            word_initial = word.words.get(num).substring(word.words.get(num).length() -1);//しりとりマスターの返答の末尾1文字を取得
            break;
        }
    }
}

/**
 * 文字列を入力するクラス
 */
class Action_2 extends Character{
    void Action_2(){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        word_end = input.substring(0,1);
    }
}

/**
 * コンピューターが返した文字列の末尾1文字と今から入力する文字列の先頭1文字が一致するかを検証するクラス
 */
class Action_3 extends Character{
    int count = 0;
    Action_0 action_0 = new Action_0();
    void Action_3(){
        while (count <= 0)
        if (word_initial.equals(word_end)) {
            break;
        }else{
            System.out.println("違う違う");
            action_0.Action_0();
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            word_end = input.substring(0,1);
        }
    }
}

/**
 * それぞれで用意したクラスの処理をまとめて実行するクラス
 */
public class Main{
    public static void main(String[] args){
        int count = 0;
        Player player = new Player();
        Action_0 action_0 = new Action_0();
        Computer computer = new Computer();
        Action_1 action_1 = new Action_1();
        Action_2 action_2 = new Action_2();
        Action_3 action_3 = new Action_3();
        player.Player_name("チャレンジャー");
        action_2.Action_2();
        while (count <= 0){
            action_0.Action_0();
            computer.Computer_name("しりとりマスター");
            action_1.Action_1();
            action_2.Action_2();
            while (count <= 0){
                action_3.Action_3();
                action_0.Action_0();
                break;
            }
        }
    }
}
