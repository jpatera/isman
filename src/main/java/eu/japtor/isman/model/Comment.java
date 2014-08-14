/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.japtor.isman.model;

import java.util.Date;

/**
 *
 * @author Honza
 */
public class Comment {
    private Long id;
    private Date created;
    private Person author;
    private Comment parentComment;
    private String header;
    private String text;
}
