package jp.ac.it_college.std.flickfighter;

import java.util.Random;

public class EnemyInfo {
    private static Random rand = new Random();
    public static int[] bossPath = {
            R.drawable.boss1 ,R.drawable.boss2
            ,R.drawable.boss3 ,R.drawable.boss4
            ,R.drawable.boss5 ,R.drawable.boss6
            ,R.drawable.boss7 ,R.drawable.boss8
            ,R.drawable.boss9 ,R.drawable.boss10
    };
    //敵キャラのパスを登録
    public static int[] enemyPath = {
            R.drawable.zako1
            , R.drawable.zako2
            , R.drawable.zako3
            , R.drawable.zako4
            , R.drawable.zako5
            , R.drawable.zako6
            , R.drawable.zako7
            , R.drawable.zako8
            , R.drawable.zako9
            , R.drawable.zako10
    };

    public static String[][] wordBook(){
        String[][] word = new String[10][];
        word[0] = new String[]{"あうあう","あいあい","あい","あああ","いえ","いう","おいえ","おういえ","おい","あお","ええ","えい","ういお","おう","えいえいおー"};
        word[1] = new String[]{"かき","かい","かかお","かいが","かくい","かきくけこ","こくご","けいご","いいこ","えかき","いか","かいき","きく","くき","ごかく"};
        word[2] = new String[]{"さき","ささ","きさい","さしすせそ","すかい","すいか","すし","しきさい","そすう","せいそう","さしえ","そうじき","えくささいず","そうさい","かくせいき"};
        word[3] = new String[]{"たちつてと","とうだい","ちかてつどう","どせい","せいどう","どうじおし","かたくそうさく","てすとたいさく","かだい","だいどうげい","だかいさく","ちっそく","たんこう","こうだい","どくさいせいじ"};
        word[4] = new String[]{"なにぬねの","なっとう","のうかがく","ないないてい","かいねこ","ななかいだて","えすえぬえす","のうどう","なかおち","ないぞう","ながねぎ","いなりずし","なきおとし","こなおとし","あなごのつくだに"};
        word[5] = new String[]{"はひふへほ","はいけい","だいほうさく","ほうそくせい","ほっかいどう","ふっそかこう","ぱいぷいす","はっくつ","はいたてき","はとぽっぽ","はっかざい","ほっとどっぐ","さとうきびばたけ","いふうどうどう","ほうそうじこ"};
        word[6] = new String[]{"まみむめも","もうしあげます","まつのき","みそにこみ","むだばなし","もえないごみ","ごもくそば","まほうつかい","まかだみあなっつ","ごまどうふ","しものせき","かがみもち","まつばづえ","むかしばなし","まぐねしうむ"};
        word[7] = new String[]{"やさいいため","しょうゆさし","ようしょうき","やっきょく","やくざいし","ゆうきゅうきゅうか","ゆうとうせい","よていひょう","ひょうしょうじょう","やきゅうじょう","しょうぼうしゃ","ゆうゆうじてき","ゆくえふめい","しょうがくせい","きゅうきゅうびょうとう"};
        word[8] = new String[]{"ごまふあざらし","あるごりずむ","くれおぱとら","らいふすたいる","りゅうがくせい","りょうりきょうしつ","れいきゃくざい","ろうごしせつ","るりいろのぐらす","ろうどうしせつ","しりめつれつ","まだがすかる","くろっくしゅうはすう","れべるあっぷ","れいがいしょり"};
        word[9] = new String[]{"ぷらっとふぉーむ","わんだーらんど","らんどせるかばー","ばんぐらでぃっしゅ","あいでんてぃてぃー","あいんしゅたいん","いんでぺんでんと","うんてんめんきょ","えんしんぶんりき","おおばんくるわせ","わしんとんしゅう","わいどすくりーん","ぷーちんだいとうりょう","ろしあんるーれっと","くりすますぷれぜんと"};
        return word;
    }

    public static String randomWordView(int i){
        String[][] tmp = wordBook();
        if (1 <= i && i <= 3) {
            return tmp[rand.nextInt(i)][rand.nextInt(15)];
        } else if (4 <= i && i <= 7) {
            return tmp[rand.nextInt(i - 3) + 3][rand.nextInt(15)];
        } else if (8 <= i && i <= 10) {
            return tmp[rand.nextInt(i - 2) + 7][rand.nextInt(15)];
        }
        return "あうあう！";
    }

    public static String bossWordView(int i) {
        String[][] tmp = wordBook();
        return tmp[i - 1][rand.nextInt(15)];
    }

    public static int randomEnemySummons(int i) {
        return rand.nextInt(i);
    }

    public static int enemyLifeSetting(int i) {
        int[] enemyLife = {
                60, 100, 150, 40, 40, 40, 50, 50, 50, 60, 60, 60
        };
        return enemyLife[i];
    }

    public static int enemyPowSetting(int i) {
        int[] enemyPow = {
                20, 20, 30, 20, 30, 30, 30, 30, 40, 40, 40, 50
        };
        return enemyPow[i];
    }

    public static int bossLifeSetting(int i) {
        int[] bossLife = {
                150, 350, 550, 70, 70, 80, 90, 100, 100, 150
        };
        return bossLife[i];
    }

    public static int bossPowSetting(int i) {
        int[] bossPow = {
                20, 20, 30, 30, 40, 40, 50, 50, 60, 60
        };
        return bossPow[i];
    }
}
