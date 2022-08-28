// Create a method to find the nth last element in a linked list.
// This contains only the method. Assumes Node objects have been created heads and methods to find next node. 

public static findNthNode(linkedList, int n) {
		Node current = null;
		Node tailSeeker = LinkedList.head;
		int count = 0;
		
        while(tailSeeker != null) {
            // TailSeeker Pointer
            tailSeeker = tailSeeker.getNextNode();

            // Move slower pointer.
            if (count >= n) {
                if (current == null) {
                    current = LinkedList.head;
                }
                current = current.getNextNode();
            }
            count ++;
        }
        return current;
	}