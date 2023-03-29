package org.example.builder;

public class Page {

    private String title;
    private String category;
    private String create_at;
    private String update_at;
    public Page(String title, String category, String create_at, String update_at) {
        this.title = title;
        this.category = category;
        this.create_at = create_at;
        this.update_at = update_at;
    }
    @Override
    public String toString() {
        return """
                タイトル : %s
                カテゴリ : %s
                公開日 : %s
                更新日 : %s
                本文 : %s
                """
                .formatted(title, category, create_at, update_at);
    }
}
