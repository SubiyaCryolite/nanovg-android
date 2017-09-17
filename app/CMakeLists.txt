cmake_minimum_required(VERSION 3.4.1)

add_library( nanovg-lib
             SHARED
             src/main/cpp/fontstash.h
             src/main/cpp/nanovg.h
             src/main/cpp/nanovg_gl.h
             src/main/cpp/nanovg_gl_utils.h
             src/main/cpp/stb_image.h
             src/main/cpp/stb_truetype.h
             src/main/cpp/nanovg.c
             src/main/cpp/nanovg-lib.cpp
           )

find_library( log-lib
              log )

target_link_libraries(nanovg-lib
                       ${log-lib}
                        log
                        EGL
                        GLESv3)