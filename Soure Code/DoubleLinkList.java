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
public class DoubleLinkList {
    Node_21 head;
    int size;

    public DoubleLinkList() {
        head = null;
        size = 0;
    }
    
    public boolean  isEmpty(){
        return head == null;
    }
    
    public void addFirst(Pembeli pb, Pesanan ps){
        if (isEmpty()) {
            head = new Node_21(null, pb, ps, null);
        } else {
            Node_21 newNode = new Node_21(null, pb, ps, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Pembeli pb, Pesanan ps){
        if (isEmpty()){
            addFirst(pb, ps);
        }else{
            Node_21 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node_21 newNode = new Node_21(current, pb, ps, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void print(){
        if (!isEmpty()) {
            Node_21 tmp = head;
            while (tmp != null) {                
              tmp = tmp.next;  
            }
            System.out.println("\nData Berhasil Diisi");
        } else {
            System.out.println("Antriang Kosong");
        }
    }
    
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, Tidak Dapat Dihapus!");
        } else if(size == 1) {
            head = null;
            System.out.println(head.pembeli.namaPembeli + "Telah Memesan Menu");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
