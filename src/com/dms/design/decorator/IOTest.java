package com.dms.design.decorator;

import java.io.*;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title IOTest
 * @Author: dongms
 * @Date: 2024/6/12
 */
public class IOTest {

    public static void main (String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("src/com/dms/design/decorator/test.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
