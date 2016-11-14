
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CCasusensa
 */
public class MapleTaxCale {

    public static void main(String[] args) throws IOException {
        int sel = 0, price = 0, quantity = 0, i = 1, mesos = 0;
        while (i == 1) {
            Strlnshow("-----MapleTaxCale-----");
            Strlnshow("1. 交易手續費計算");
            Strlnshow("2. 個人商店、精靈商人手續費計算");
            Strlnshow("3. 關於本作者");
            Strlnshow("4. 結束本程式");
            try {
                do {
                    Scanner sc = new Scanner(System.in);
                    Strshow("請輸入選項:");
                    sel = sc.nextInt();
                    switch (sel) { // 結束程式
                        case 4:
                            System.out.println("感謝使用本程式^^");
                            try {
                                System.exit(0);
                            } catch (Exception e) {
                            }
                            break;
                        case 3: // 關於本程式作者
                            try {
                                java.net.URI uri = new java.net.URI("https://www.facebook.com/Haola");
                                java.awt.Desktop.getDesktop().browse(uri);
                            } catch (URISyntaxException | IOException e) {
                            }
                            break;
                        case 2: // 個人商店、精靈商人手續費計算
                            Strshow("請輸入販售的數量: ");
                            quantity = sc.nextInt();
                            Strshow("請輸入每個數量販售的價格: ");
                            price = sc.nextInt();
                            final int totalmeso = price * quantity;
                            Strlnshow("-------專業個人商店、精靈商人計算-------\r\n總共賣出金額:" + totalmeso + " 手續費扣除:" + EntrustedStoreTax(totalmeso) + "\r\n實際的總共收入:" + (totalmeso - EntrustedStoreTax(totalmeso)));
                            break;
                        case 1: // 交易計算
                            Strshow("請輸入交易金額: ");
                            mesos = sc.nextInt();
                            Strlnshow("-------交易楓幣計算-------\r\n交易收穫總金額:" + mesos + " 手續費扣除:" + getTaxAmount(mesos) + "\r\n實際的總共收入:" + (mesos - getTaxAmount(mesos)));
                            break;
                        default:
                            Strlnshow("請輸入正確的選項...");
                            break;
                    }
                } while (sel == 4 && sel == 3 && sel == 2 && sel < 1);
            } catch (Exception ex) {
                Strlnshow("這不是一個數字，請輸入正確的選項...");
            }
        }
    }

    public static void Strshow(String a) {
        System.out.print(a);
    }

    public static void Strlnshow(String a) {
        System.out.println(a);
    }

    public static int IntShow(int a) {
        System.out.print(a);
        return a;
    }

    public static int IntInShow(int a) {
        System.out.println(a);
        return a;
    }

    public static int getTaxAmount(final int meso) {
        if (meso < 100000000) if (meso >= 25000000) {
            return (int) Math.round(0.05 * meso);
        } else if (meso < 10000000) if (meso >= 5000000) {
            return (int) Math.round(0.03 * meso);
        } else if (meso < 1000000) if (meso >= 100000) {
            return (int) Math.round(0.008 * meso);
        } else {
            return (int) Math.round(0.06 * meso);
        } else {
            return (int) Math.round(0.018 * meso);
        } else {
            return (int) Math.round(0.04 * meso);
        }
        return 0;
    }

    public static int EntrustedStoreTax(final int meso) {
        if (meso < 100000000) if (meso >= 25000000) {
            return (int) Math.round(0.025 * meso);
        } else if (meso < 10000000) if (meso >= 5000000) {
            return (int) Math.round(0.015 * meso);
        } else if (meso < 1000000) if (meso >= 100000) {
            return (int) Math.round(0.004 * meso);
        } else {
            return (int) Math.round(0.03 * meso);
        } else {
            return (int) Math.round(0.009 * meso);
        } else {
            return (int) Math.round(0.02 * meso);
        }
        return 0;
    }
}
