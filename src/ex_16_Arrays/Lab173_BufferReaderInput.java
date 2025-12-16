package ex_16_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab173_BufferReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of N : ");
        int n = Integer.parseInt(bufferReader.readLine().trim());

        System.out.println(n);
    }
}
