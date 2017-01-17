/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author dayvison
 */
public class LetrasMauisculas extends PlainDocument{
   
   @Override
   public void insertString(int   offset,String srt, javax.swing.text.AttributeSet attr)
           throws BadLocationException{
            super.insertString(offset, srt.replaceAll("^A-Z", ""), attr);
   }
   
   public void replace (int   offset,String srt, javax.swing.text.AttributeSet attr)
           throws BadLocationException{
            super.insertString(offset, srt.replaceAll("^A-Z", ""), attr);
   }
}
