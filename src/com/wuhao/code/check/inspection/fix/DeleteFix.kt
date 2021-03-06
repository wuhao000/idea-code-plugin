/*
 * ©2009-2018 南京擎盾信息科技有限公司 All rights reserved.
 */
package com.wuhao.code.check.inspection.fix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project

/**
 * 删除元素修复
 * @author 吴昊
 * @since 1.3.1
 */
class DeleteFix : LocalQuickFix {

  override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
    descriptor.psiElement.delete()
  }

  override fun getFamilyName(): String {
    return "删除"
  }

}

