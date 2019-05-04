package hook;

/**
 * 测试钩子函数
 *
 * @author lucky
 * @create 2019/5/4
 * @since 1.0.0
 */
public class HookTest {

    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("this is hook demo...");
                // TODO
            }
        });

        int i = 0;
        int j = 10/i;
        System.out.println("j" + j);
    }
}
