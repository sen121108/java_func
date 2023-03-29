package org.example.builder;

public class pageBuilder {
    private String title;
    private String category = "なし";
    private String create_at = "xxxx-xx-xx";
    private String update_at = "xxxx-xx-xx";

    public Page build() {
        if(title == null) throw new IllegalStateException("titleを選択してください。");
        return new Page(title,category,create_at,update_at);
    }
    pageBuilder setTitle(String title) {
        this.title = title;
        return  this;
    }
    pageBuilder setCategory(String category) {
        this.category = category;
        return  this;
    }
    pageBuilder setCreateAt(String create_at) {
        this.create_at = create_at;
        return  this;
    }
    pageBuilder setUpdateAt(String update_at) {
        this.update_at = update_at;
        return  this;
    }
}
