package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 14:08
 */
public class Render {

    /**
     * ��һ����ɫ��Ļ������һά�����У����������ÿ��Ԫ�ش���������8λ�����ص�ֵ��
     * ��ʵ��һ������������x����y������Ϳ����ɫ(���ر�Ŵ��㿪ʼ)�������Ծ���ʹ�����İ취��
     * <p>
     * ������ʾ��Ļ������screen(�����е�ÿ��Ԫ�ش���������8�����أ��Ҵ������ҵ����طֱ��ӦԪ��
     * �Ķ����ƵĴӵ͵���λ)���Լ�int x,int y��������������������֤�������ݺϷ����뷵��Ϳɫ����µ���Ļ���顣
     *
     * @param screen
     * @param x
     * @param y
     * @return
     */
    public int[] renderPixel(int[] screen, int x, int y) {
        // write code here
        for (int i = x; i <= y; ++i) {
            int k = i % 8;
            int t = i / 8;
            screen[t] = screen[t] | (1 << k);
        }
        return screen;
    }
}
