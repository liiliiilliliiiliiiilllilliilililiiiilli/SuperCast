# <ins>SuperCast</ins> — code description. Android.

[![ru](https://img.shields.io/badge/lang-ru-blue.svg)](https://github.com/liiliiilliliiiliiiilllilliilililiiiilli/SuperCast-development-Android/blob/prime/CODEDESCRIPTION/CODEDESCRIPTION_Multilanguage/CODEDESCRIPTION.ru.md)
[![en](https://img.shields.io/badge/lang-en-green.svg)](https://github.com/liiliiilliliiiliiiilllilliilililiiiilli/SuperCast-development-Android/blob/prime/CODEDESCRIPTION/CODEDESCRIPTION_Multilanguage/CODEDESCRIPTION.en.md)
[![cn](https://img.shields.io/badge/lang-cn-red.svg)](https://github.com/liiliiilliliiiliiiilllilliilililiiiilli/SuperCast-development-Android/blob/prime/CODEDESCRIPTION/CODEDESCRIPTION_Multilanguage/CODEDESCRIPTION.cn.md)
> Translated with **[Google Translate](https://translate.google.com)**

The current file describes the project code base for the Android platform, accepted approaches to code formatting, and other things.
The **CODEDESCRIPTION** and **README** files have been translated into several languages for accessibility and are formatted in **MarkDown** or **EyeComfort** style.

The project file system has a strict structure.
The code is commented and adheres to a certain style (indents, naming and literals, relative positions of functional blocks, etc.).

## 🗃️ Files and folders

* In addition to the **.xml** and **.webp** files required for the application to work, the project is built only from **.kt** files (functionality) or resource files **.png** (images) and **.ttf** (fonts).
  You will not find files of other extensions.

* The project file names adhere to the following convention:

  * All Kotlin files are formatted in **PascalCase** (_FileName.kt_).
   
  * All Resource files are formatted in **SnakeCase** (_file_name.png_).
   
  * All Kotlin packages (except **\_types\_/** packages for Kotlin types) are formatted in fused lowercase (_packagename/_)
  
  * All Kotlin packages and files used only during development are separated on both sides by two underscores (_\_\_packagename\_\_/_, _\_\_File_name\_\_.kt_, _\_\_file_name\_\_.png_).

## 🕸️ Structure

* **res/** - Resources folder. Only **drawable/** (only **.png**, only 150\*150 or 500\*500) and **font/** (only **.ttf**) are used.

* **com.example.supercast/** - Activities folder, where all development takes place:

  * **MainActivity.kt** - the main and only Activity of the application.

  * **lib/** - all project libraries - colors, fonts, images, as well as Kotlin methods, taken out separately.

  * **ui/** - all graphic components for **MainActivity**:

    * **Ui.kt** - the main and only component that renders **MainActivity**.

    * **components/** - common components used by different navigation pages.

      Some components can be complex, so they are split into parts themselves.
      For these parts, another internal "components" folder is not created - they are placed in their own packages next to each other.
      If necessary, such parts can be split again.

    * **pages/** - navigation pages that make up the UI:
      
      Each page is divided into graphic layers **layers/**:
          
      * **Main** - the bottommost and main layer, where the main components of the page are located.
           
      * **Tools** - a layer above the main one, used for bars, fixed buttons and other fixed elements.
           
      * **Sliders** - side menus that slide across the screen.
          
      * **Windows** is the highest layer, displaying pop-up windows.

      Components on the same layer never intersect - the convolution of layers is created to make the user experience more understandable.

      Components that make up the navigation page layer are isolated in a local folder **.../layers/\[layer]/components/**.
      If necessary, layer components or the layer itself can use components from the **com.example.supercast/ui/components/** folder.

## ❕ Important points

* In the project, you will never see something like ".../components/.../components/.../components/...".
  Such overloading complicates the project, and it is better to avoid it.

* In any "components" folders, components can use each other for self-construction (avoiding recursion), but you will not be able to get into the "guts" (components) of a neighboring component.
  Any component part is encapsulated in this component - components have a strict hierarchy of using their parts in depth.

* Components are used, but never copied for use.
  Any declared graphic component must be flexible enough for customization by content or design - multiplying several such components significantly slows down development and debugging.

### That's it! May the force be with you!