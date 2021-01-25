package myfirstapp;

/*
Create by : pej
 */
public class MyJavaApp {

    public static void main(String[] stringArray) {
        System.out.println("Hello World");
        System.out.println("Hello World Java App");

        int myNumber;
        myNumber = 0;
        myNumber = myNumber + 5;
        System.out.println(myNumber);

        int number = -10;
        int abs = 0;

        if(number >= 0){
            abs = number;
        }else{
            abs -= number;
        }

        System.out.println(number);
        System.out.println(abs);
    }
}
/*
사용법: java [-options] class [args...]
           (클래스 실행)
   또는  java [-options] -jar jarfile [args...]
           (jar 파일 실행)
여기서 options는 다음과 같습니다.
    -d32          사용 가능한 경우 32비트 데이터 모델을 사용합니다.
    -d64          사용 가능한 경우 64비트 데이터 모델을 사용합니다.
    -server       "server" VM을 선택합니다.
                  기본 VM은 server입니다..

    -cp <디렉토리 및 zip/jar 파일의 클래스 검색 경로>
    -classpath <디렉토리 및 zip/jar 파일의 클래스 검색 경로>
                  클래스 파일을 검색할 ;(으)로 구분된 디렉토리,
                  JAR 아카이브 및 ZIP 아카이브 목록입니다.
    -D<name>=<value>
                  시스템 속성을 설정합니다.
    -verbose:[class|gc|jni]
                  상세 정보 출력을 사용으로 설정합니다.
    -version      제품 버전을 인쇄한 후 종료합니다.
    -version:<value>
                  경고: 이 기능은 사용되지 않으며
                  이후 릴리스에서 제거됩니다.
                  실행할 버전을 지정해야 합니다.
    -showversion  제품 버전을 인쇄한 후 계속합니다.
    -jre-restrict-search | -no-jre-restrict-search
                  경고: 이 기능은 사용되지 않으며
                  이후 릴리스에서 제거됩니다.
                  버전 검색에서 사용자 전용 JRE를 포함/제외합니다.
    -? -help      이 도움말 메시지를 인쇄합니다.
    -X            비표준 옵션에 대한 도움말을 인쇄합니다.
    -ea[:<packagename>...|:<classname>]
    -enableassertions[:<packagename>...|:<classname>]
                  세분성이 지정된 검증을 사용으로 설정합니다.
    -da[:<packagename>...|:<classname>]
    -disableassertions[:<packagename>...|:<classname>]
                  세분성이 지정된 검증을 사용 안함으로 설정합니다.
    -esa | -enablesystemassertions
                  시스템 검증을 사용으로 설정합니다.
    -dsa | -disablesystemassertions
                  시스템 검증을 사용 안함으로 설정합니다.
    -agentlib:<libname>[=<options>]
                  <libname> 고유 에이전트 라이브러리를 로드합니다(예: -agentlib:hprof).
                  -agentlib:jdwp=help 및 -agentlib:hprof=help도 참조하십시오.
    -agentpath:<pathname>[=<options>]
                  전체 경로명을 사용하여 고유 에이전트 라이브러리를 로드합니다.
    -javaagent:<jarpath>[=<options>]
                  Java 프로그래밍 언어 에이전트를 로드합니다. java.lang.instrument를 참조하십시오.
    -splash:<imagepath>
                  이미지가 지정된 스플래시 화면을 표시합니다.
자세한 내용은 http://www.oracle.com/technetwork/java/javase/documentation/index.html을 참조하십시오.

 */