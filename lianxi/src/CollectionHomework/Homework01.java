package CollectionHomework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张 书航
 */
public class Homework01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，" +
                "数百万印度教信徒赴恒河\"圣浴\"引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，" +
                "捞起一看赶紧放生");
        List list = new ArrayList();
        list.add(news1);
        list.add(news2);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(News.getT(((News) (list.get(i))).getTitle()));
//            String temp = "";
//            for (int j = 0; j < cA.length; j++) {
//
//                temp += cA[j];
//                if (j == 14) {
//                    temp += "...";
//                    System.out.println(temp);
//                    break;
//                }
        }
    }
}


class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    static String getT(String title) {
        if (title == null) return "";
        if (title.length() > 15) {
            return title.substring(0, 15) + "...";
        }
        return title;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}