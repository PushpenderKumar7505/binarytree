public class binaryroot {
int data;
binaryroot left;
binaryroot right;
binaryroot (int data)
{
    this.data=data;
}
    }

class Test
{
    public static void main(String[] args) {
        binaryroot root = new binaryroot(10);
        binaryroot rootleft = new binaryroot(5);
        binaryroot rootright = new binaryroot(8);
        root.left =rootleft;
        root.right =rootright;
        print(root);

    }
public static void print(binaryroot root)
{
    if(root==null)
    {
        return;
    }
    System.out.println(root.data);
    print(root.left);
    print(root.right);
}

}