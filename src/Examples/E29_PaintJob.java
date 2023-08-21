package Exercises;

public class E29_PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(7,5,2,1));
        System.out.println(getBucketCount(7,8,9));
        System.out.println(getBucketCount(7,8));

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket-extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(area/areaPerBucket);
    }
}
