package com.example.buoi5;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerview;
    private WordListAdapter mAdapter;
    private LinkedList<ViewItem> mWordList = new LinkedList<ViewItem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewItem item1 = new ViewItem(R.drawable.pc1, "#1 Trong lòng mỗi người đều có những bí mật không thể để cho ai biết", "Mỗi người đều sống 3 cuộc đời: Cuộc đời công khai, riêng tư và bí mật\n" +
                "\n" +
                "Nếu là cậu, cậu có chọn vạch trần bí mật của người khác không? Có đôi lúc cậu lao tâm khổ tứ để biết được chân tướng sự việc nhưng đằng sau chân tướng lại là kết cục mà cậu chẳng hề mong..");
        ViewItem item2 = new ViewItem(R.drawable.pc2, "#2 Vì sao không yêu nhưng cũng không chịu từ chối?", "Tại sao cậu lại muốn ở bên cạnh một người mà người ấy không hề thấy hào hứng khi ở cạnh cậu?\n" +
                "\n" +
                "Sự lạnh nhạt, thờ ơ không phải là một cách từ chối khéo léo. Nó không phải là cách thể hiện sự tôn trọng và muốn giữ lại tôn nghiêm cho đối phương. Thực chất, đó là cậy vào sự yêu mến của người ta, tùy ý lãng phí thời gian của người ta mà thôi.");
        ViewItem item3 = new ViewItem(R.drawable.pc3, "#3 Cung điện ký ức - Não cá vàng đã biết dùng \"não\" chưa?", "Não cá vàng là cụm từ dùng để chỉ về những người có tính đãng trí, nói trước quên sau. Lý giải về lí do vì sao lại dùng hình ảnh cá vàng để miêu tả cho hiện tượng nhanh quên này là vì người xưa đồn rằng các vàng là loài sinh vật có trí nhớ ngắn hạn, mọi ký ức trong não cá vàng chỉ duy trì được trong vòng 3 giây rồi biến mất.\n" +
                "\n" +
                "Thực hư là như thế nào?\n" +
                "\n" +
                "Thực ra, cá vàng không hề nhanh quên như vậy, và khả năng ghi nhớ của não bộ chúng ta có thể cải thiện nhờ các phương pháp luyện tập.\n" +
                "\n" +
                "Luyện tập ra sao cho hiệu quả? Cung điện ký ức là gì?");
        ViewItem item4 = new ViewItem(R.drawable.pc4, "#4 Vì sao chuyện xấu lại xảy ra với người tốt?", "Người ta nói rằng: “Thiện ác hữu báo” là lẽ công bằng của đất trời. Vạn sự vạn vật trên thế gian không hề ngẫu nhiên, hết thảy đều có an bài trong đó. Người gieo hạt giống tốt, quả ngọt tuy chưa tới nhưng trong tâm hồn họ luôn thấy an bình. Người gieo hạt giống xấu, sau này ắt sẽ nhận quả đắng cay.");
        ViewItem item5 = new ViewItem(R.drawable.pc5, "#5 Vì sao thật khó để nói lời xin lỗi?", "Lời xin lỗi chân thành quả thực, không dễ gì có thể nói ra. Còn những câu xin lỗi đại loại như: “Ồ, tôi xin lỗi được chưa?” thì tuyệt nhiên sẽ không làm vừa lòng người nhận lời xin lỗi và thậm chí còn gây ra nhiều tổn thương. Vậy như nào mới là xin lỗi chân thành?\n" +
                "\n");
        ViewItem item6 = new ViewItem(R.drawable.pc5, "#5 Vì sao thật khó để nói lời xin lỗi?", "Lời xin lỗi chân thành quả thực, không dễ gì có thể nói ra. Còn những câu xin lỗi đại loại như: “Ồ, tôi xin lỗi được chưa?” thì tuyệt nhiên sẽ không làm vừa lòng người nhận lời xin lỗi và thậm chí còn gây ra nhiều tổn thương. Vậy như nào mới là xin lỗi chân thành?\n" +
                "\n");
        ViewItem item7 = new ViewItem(R.drawable.pc5, "#5 Vì sao thật khó để nói lời xin lỗi?", "Lời xin lỗi chân thành quả thực, không dễ gì có thể nói ra. Còn những câu xin lỗi đại loại như: “Ồ, tôi xin lỗi được chưa?” thì tuyệt nhiên sẽ không làm vừa lòng người nhận lời xin lỗi và thậm chí còn gây ra nhiều tổn thương. Vậy như nào mới là xin lỗi chân thành?\n" +
                "\n");

        mWordList.add(item1);
        mWordList.add(item2);
        mWordList.add(item3);
        mWordList.add(item4);
        mWordList.add(item5);
        mWordList.add(item6);
        mWordList.add(item7);

        mRecyclerview=findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mWordList);
        mRecyclerview.setAdapter(mAdapter);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));

    }
}