package com.cheems.codeshowcommunitybackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除类
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
}
