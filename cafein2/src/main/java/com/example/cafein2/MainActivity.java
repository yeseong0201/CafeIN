package com.example.cafein2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button coffee, energy_drink, condition_drink;
    RecyclerView recyclerView;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coffee = findViewById(R.id.coffee);
        energy_drink = findViewById(R.id.energh_drink);
        condition_drink = findViewById(R.id.condition_drink);

        recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
        getData();

        coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
        energy_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.requestFocusFromTouch();
                recyclerView.scrollToPosition(1);
            }
        });
        condition_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.requestFocusFromTouch();
                recyclerView.scrollToPosition(9);
            }
        });
    }

    private void getData() {
        // 임의의 데이터입니다.
        List<String> names = Arrays.asList(
                "칸타타", "프렌치 카페", "레쓰비", "스누피", "스타벅스 커피(아메리카노)", "T.O.P",
                "몬스터", "핫식스", "레드불",
                "박카스", "오로나민 C", "구론산"
        );
        List<String> mgs = Arrays.asList(
                "130mg",
                "60mg",
                "63mg",
                "237mg",
                "150mg",
                "98mg",
                "36mg",
                "86mg",
                "90mg",
                "30mg",
                "14mg",
                "20mg"
        );
        List<String> kcal = Arrays.asList(
                "50kcal",
                "190kcal",
                "130kcal",
                "315kcal",
                "10kcal",
                "109kcal",
                "42kcal",
                "175kcal",
                "135kcal",
                "40kcal",
                "70kcal",
                "76kcal"
        );
        List<Integer> images = Arrays.asList(
                R.drawable.kantata,
                R.drawable.french_cafe,
                R.drawable.lessbee,
                R.drawable.snupi,
                R.drawable.star,
                R.drawable.top,
                R.drawable.monster,
                R.drawable.hotsix,
                R.drawable.redbull,
                R.drawable.backas,
                R.drawable.oronamin_c,
                R.drawable.guronsan
        );
        for (int i = 0; i < names.size(); i++) {
            // 각 List의 값들을 data 객체에 set 해줍니다.
            Item item = new Item();
            item.setName(names.get(i));
            item.setKcal(kcal.get(i));
            item.setImage(images.get(i));
            item.setMg(mgs.get(i));

            // 각 값이 들어간 data를 adapter에 추가합니다.
            adapter.addItem(item);
        }

        // adapter의 값이 변경되었다는 것을 알려줍니다.
        adapter.notifyDataSetChanged();
    }
}
