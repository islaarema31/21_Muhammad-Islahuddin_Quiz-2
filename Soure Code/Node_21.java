/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Node_21 {
    Pembeli pembeli;
    Pesanan pesanan;
    Node_21 prev, next;
    
    Node_21(Node_21 prev, Pembeli pembeli, Pesanan pesanan, Node_21 next) {
        this.prev = prev;
        this.pembeli = pembeli;
        this.pesanan = pesanan;
        this.next = next;
    }
    
}
