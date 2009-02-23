require 'gen/ConstGenerator'
def gen_openflags_java(options)
  ConstGenerator.new 'platform.openflags', options do |cg|
    cg.include "fcntl.h"
    cg.include "string.h"
    cg.strfunc = "strerror"
    cg.unknown_range=[20000, 20999]
    consts = %w[
      O_RDONLY
      O_WRONLY
      O_RDWR
      O_ACCMODE
      O_NONBLOCK
      O_APPEND
      O_SYNC
      O_SHLOCK
      O_EXLOCK
      O_ASYNC
      O_FSYNC
      O_NOFOLLOW
      O_CREAT
      O_TRUNC
      O_EXCL
      O_EVTONLY
      O_DIRECTORY
      O_SYMLINK
    ]
    consts.each { |c| cg.const c }
  end
end