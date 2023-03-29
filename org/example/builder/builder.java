package org.example.builder;

public class builder {
    public static void main(String[] args) {
        final var builder = new pageBuilder().setTitle("title").build();
        System.out.println(builder);
    }
}
