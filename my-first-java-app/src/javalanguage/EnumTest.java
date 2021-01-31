package javalanguage;

public class EnumTest {

    public enum Level{
        HIGH,
        MEDIUM,
        LOW
    }

    public enum LevelFinal{
        HIGHF(3),
        MEDIUMF(2),
        LOWF(1);

        private final int levelCode;

        private LevelFinal(int levelCode){
            this.levelCode = levelCode;
        }

        public int getLevelCode(){
            return this.levelCode;
        }
    }

    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println(level);

//        for(Level lv : Level.values()){
//            System.out.println(lv);
//        }

        String levelText = level.toString();
        String levelText2 = Level.HIGH.toString();

        System.out.println(levelText);
        System.out.println(levelText2);

        LevelFinal lf = LevelFinal.HIGHF;
        System.out.println(lf.getLevelCode());
    }
}
