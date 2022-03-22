package algorithm.leetcode.ex;
//链表反置
public class ReverseList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    //迭代法
    public static ListNode iterate(ListNode head){
        ListNode prev = null , next;
        ListNode curr = head;
        while(curr !=null){
            next = curr.next;//把当前节点的指向地址拿出来
            curr.next = prev;//把当前节点的前置节点的地址放进去
             prev = curr;//将当前节点设为前置节点
             curr = next;//然后把它后置节点设置为当前节点继续进行指向反转的操作
        }
        return prev;//返回指针已反向的节点
    }

    //递归法
    public static ListNode recursion(ListNode head){
        if(head == null||head.next == null){
            return head;
        }
        ListNode new_head = recursion(head.next);//递归调用找到新的头节点
        head.next.next = head;
        head.next = null;
        return new_head;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5,null);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        System.out.println(node1);
//        ListNode prev = iterate(node1);
        ListNode prev = recursion(node1);
        System.out.println(prev);


    }


}
