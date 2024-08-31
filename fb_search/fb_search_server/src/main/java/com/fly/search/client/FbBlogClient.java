package com.fly.search.client;

import com.fly.common.resultVo.R;
import com.fly.search.dto.SearchResultDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xiang.wei on 2019/2/16
 *
 * @author xiang.wei
 */
@Component
@FeignClient(name = "fb-blog")
public interface FbBlogClient {

    /**
     * @param postId
     * @return
     */
    @GetMapping("/fb-blog/findPostDTOByPostId")
    R findPostDTOByPostId(@RequestParam("postId") long postId);
}
