package logic;

import entity.PostType;

import java.util.Scanner;

public class PostTypeLogic extends PostType {
    private PostTypeLogic[] postTypes;

    public PostTypeLogic(PostTypeLogic[] postTypes) {
        this.postTypes = postTypes;
    }

    public void inputPostType() {
        System.out.printf("Nhập số lượng tuyến muốn thêm ");
        int typeNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < typeNum; i++) {
            PostType temp = new PostType();
            temp.inputInfo();
            savePostTypes(temp);
        }
    }

    public void savePostTypes(PostType temp) {
        for (int i = 0; i < postTypes.length; i++) {
            if (postTypes[i]==null);
            postTypes[i] = (PostTypeLogic) temp;
            break;
        }
    }
}
