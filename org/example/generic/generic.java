package org.example.generic;

public class generic {
    /**
     * Javaのジェネリックは、Javaプログラミング言語において、
     * 型パラメータを使用して、クラス、メソッド、インターフェースを
     * 定義するための仕組みです。
     * つまり、ジェネリックを使用することで
     * 複数の異なる型のオブジェクトに対して
     * 同じコードを再利用することができます。
     *
     * パラメーター	説明
     * T	クラス、インターフェース、メソッドの型パラメーター。
     * E	コレクション要素の型パラメーター。
     * K	マップのキーの型パラメーター。
     * V	マップの値の型パラメーター。
     * N	数値型の型パラメーター。
     * S, U, V	Tと同じく、クラス、インターフェース、メソッドの型パラメーター。
     * R	戻り値の型パラメーター。
     *
     */
    public static class PairMap<T> {

        private T first;
        private T second;

        public T first() {
            return this.first;
        }

        public T second() {
            return this.second;
        }

        public PairMap(T first, T second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        PairMap pair = new PairMap<String>("ひとつめ", "ふたつめ");

        System.out.println("first is " + pair.first());
        System.out.println("Second is " + pair.second());

        System.out.println("----------");
        // 数字のPairを作成
        PairMap pair2 = new PairMap<Integer>(4, 2);
        System.out.println("first is " + pair2.first());
        System.out.println("Second is " + pair2.second());
    }

}
