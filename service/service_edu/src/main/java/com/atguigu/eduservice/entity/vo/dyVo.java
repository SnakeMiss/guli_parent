package com.atguigu.eduservice.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 用于生成树结构的数据模型，二级分类
 *
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月14日
 */
@ApiModel(value="二级课程分类", description="二级课程分类")
@Data
public class dyVo {

    @ApiModelProperty(value = "二级课程分类ID")
    private String id;

    @ApiModelProperty(value = "二级课程分类名称")
    private String parentId;

    @ApiModelProperty(value = "二级课程分类名称")
    private String title;

    private List<dyVo> children = new ArrayList<>();

    public static dyVo findNode(List<dyVo> nodes, String key) {
        List<dyVo> finds = new ArrayList<>();
        findNode(nodes, key, finds);
        return finds.size() != 0 ? finds.get(0) : null;
    }

    public static void findNode(List<dyVo> nodes, String key, List<dyVo> finds) {
        for (dyVo node : nodes) {
            if (key.equals(node.getId()))
                finds.add(node);
            findNode(node.getChildren(), key, finds);
        }
    }


}
