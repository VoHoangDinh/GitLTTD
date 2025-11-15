package com.example.vohoangdinh_2107_baitap15_11;

public class ItemData {
    public String title;
    public int imageRes; // Có thể bằng 0 nếu không dùng ảnh

    // Dùng khi có text + ảnh
    public ItemData(String title, int imageRes) {
        this.title = title;
        this.imageRes = imageRes;
    }

    // Dùng khi chỉ có text (Grid)
    public ItemData(String title) {
        this.title = title;
        this.imageRes = 0; // Không có ảnh
    }
}
