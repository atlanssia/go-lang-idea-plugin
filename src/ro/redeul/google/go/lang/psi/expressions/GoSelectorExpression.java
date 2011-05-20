package ro.redeul.google.go.lang.psi.expressions;

import com.intellij.psi.PsiExpression;

/**
 * Author: Toader Mihai Claudiu <mtoader@gmail.com>
 * <p/>
 * Date: 5/19/11
 * Time: 10:56 PM
 */
public interface GoSelectorExpression extends GoPsiExpression {

    GoPsiExpression getExpressionContext();

}
